package co.com.auto.utils;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.slf4j.LoggerFactory;

public final class CsvUtil {
  private static final String FILTER_ID = "filterId";

  private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(CsvUtil.class);

  private CsvUtil() {}

  public static List<Map<String, String>> getAllDataCsv(String csvName) {
    List<Map<String, String>> dataList = new ArrayList<>();
    try {
      File file = new File("./src/test/resources/data/" + csvName + ".csv");
      InputStream in = new FileInputStream(file);
      Reader reader = new InputStreamReader(in, StandardCharsets.UTF_8);
      Iterator<Map<String, String>> iterator =
          new CsvMapper()
              .readerFor(Map.class)
              .with(CsvSchema.emptySchema().withColumnSeparator(',').withHeader())
              .readValues(reader);
      while (iterator.hasNext()) {
        Map<String, String> row = iterator.next();
        dataList.add(row);
      }
      in.close();
      reader.close();
    } catch (IOException e) {
      LOGGER.error(e.getMessage());
    }
    return dataList;
  }

  public static List<Map<String, String>> getDataCsvWithFilter(String csvName, String filter) {
    return filterList(getAllDataCsv(csvName), filter);
  }

  public static List<Map<String, String>> filterList(
      List<Map<String, String>> dataTable, String filterId) {
    List<Map<String, String>> filteredList = new ArrayList<>();
    for (Map<String, String> list : dataTable) {
      if (list.get(FILTER_ID).equalsIgnoreCase(filterId.toLowerCase())) {
        filteredList.add(list);
      }
    }
    for (int i = 0; i < filteredList.size(); i++) {
      filteredList.get(i).remove(FILTER_ID);
    }
    return filteredList;
  }

  public static Map<String, String> getUniqueMapDataCsv(String csvName, String filter) {
    return getDataCsvWithFilter(csvName, filter).stream().findFirst().orElse(null);
  }
}
