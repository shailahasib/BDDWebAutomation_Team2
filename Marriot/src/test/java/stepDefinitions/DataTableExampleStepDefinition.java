package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataTableExampleStepDefinition {


    @Given("I update ADDRESS tab data in building form")
    public void i_update_address_tab_data_in_building_form(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<List<String>> data = dataTable.asLists(String.class);
        String buildingName = data.get(1).get(1);
        String reference = data.get(2).get(1);
        System.out.println(buildingName);
        System.out.println(reference);

    }

    @Given("I enter the following login details:")
    public void i_enter_the_following_login_details(List<List<String>> table) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.


        Map<String, String> mapTable = CucumberUtil.TableDictionaryConverter(table);
        System.out.println(mapTable.get("username"));
        System.out.println(mapTable.get("password"));


    }

    public static class CucumberUtil {
        //     public static synchronized Map<String, String> TableDictionaryConverter(DataTable table) {                    -- removed this concept because of version issues in DataTable
        public static synchronized Map<String, String> TableDictionaryConverter(List<List<String>> data) {
            Map<String, String> mapTable = new HashMap<String, String>();
            for (List<String> rows : data) {
                mapTable.put(rows.get(0), rows.get(1));
            }
            return mapTable;
        }


    }






}
