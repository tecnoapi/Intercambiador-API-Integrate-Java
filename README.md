# Intercambiador-API-Integrate-Java

## Installation

Descargar el archivo apiintercambiador-1.0-SNAPSHOT.jar. Se encuentra dentro del directorio target.
Añadir la dependencia:
```
<dependencies>
    <dependency>
        <groupId>com.tecnoapi</groupId>
        <artifactId>apiintercambiador</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>
</dependencies>
```
Importar el packete de la libreria instalada:
```
import com.tecnoapi.apiintercambiador.Apiintercambiador;
```


## Usage

```
import com.tecnoapi.apiintercambiador.Apiintercambiador;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        Apiintercambiador ai = new Apiintercambiador("token", true); //true = sandbox
    }
}
```


# GET

```
String result = ai.getProperties();
```


# POST

```
ArrayList<HashMap<String, String>> testList = new ArrayList<HashMap<String, String>>();        
        
HashMap<String, String> map = new HashMap<String, String>();
map.put("fuente_origen", "1123123");
map.put("agency_id", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0aW1lIjoiV2VkIEp1biAwOCAyMDIyIDEwOjM5OjE2IEdNVCswMjAwIChob3JhIGRlIHZlcmFubyBkZSBFdXJvcGEgY2VudHJhbCkiLCJ1c2VySWQiOiI2Mjk0YmM3ZGU1ODVlODhiODYxNzYzZDAiLCJpYXQiOjE2NTQ2Nzc1NTZ9.0xFLIf631G7PbXEL_ef04O3w6gjnu8lZ-gExsR9Wfto");
map.put("reference", "11905-OB");
map.put("status_id", "1");
map.put("status_property_id", "1");
map.put("property_type_id", "8");        
map.put("property_subtype_id", "2"); 
map.put("visibility_type_id", "2"); 
map.put("cadastral_reference", "9015608DF2891E0017AL"); 
map.put("price_sale", ""); 
map.put("price_rent", "95"); 
map.put("community_costs", ""); 
map.put("ibi_costs", ""); 
map.put("traspass", ""); 
map.put("orientation_id", "6"); 
map.put("energy_clasification_id", "6"); 
map.put("co2_release_class_id", "2");
map.put("conservation_state_id", "4");
testList.add(map);

HashMap<String, String> map2 = new HashMap<String, String>();
map2.put("fuente_origen", "1123123");
map2.put("agency_id", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0aW1lIjoiV2VkIEp1biAwOCAyMDIyIDEwOjM5OjE2IEdNVCswMjAwIChob3JhIGRlIHZlcmFubyBkZSBFdXJvcGEgY2VudHJhbCkiLCJ1c2VySWQiOiI2Mjk0YmM3ZGU1ODVlODhiODYxNzYzZDAiLCJpYXQiOjE2NTQ2Nzc1NTZ9.0xFLIf631G7PbXEL_ef04O3w6gjnu8lZ-gExsR9Wfto");
map2.put("reference", "11906-OB");
map2.put("status_id", "1");
map2.put("status_property_id", "1");
map2.put("property_type_id", "8");        
map2.put("property_subtype_id", "2"); 
map2.put("visibility_type_id", "2"); 
map2.put("cadastral_reference", "9015608DF2891E0018AL"); 
map2.put("price_sale", ""); 
map2.put("price_rent", "195"); 
map2.put("community_costs", ""); 
map2.put("ibi_costs", ""); 
map2.put("traspass", ""); 
map2.put("orientation_id", "6"); 
map2.put("energy_clasification_id", "6"); 
map2.put("co2_release_class_id", "2");
map2.put("conservation_state_id", "4");
testList.add(map2);

String result = ai.addProperty(testList);
```


# PUT

```
ArrayList<HashMap<String, String>> testList = new ArrayList<HashMap<String, String>>();        
        
HashMap<String, String> map = new HashMap<String, String>();
map.put("property_id", "62aafcb53e575f7b21a16dfd");
map.put("fuente_origen", "1123123");
map.put("agency_id", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0aW1lIjoiV2VkIEp1biAwOCAyMDIyIDEwOjM5OjE2IEdNVCswMjAwIChob3JhIGRlIHZlcmFubyBkZSBFdXJvcGEgY2VudHJhbCkiLCJ1c2VySWQiOiI2Mjk0YmM3ZGU1ODVlODhiODYxNzYzZDAiLCJpYXQiOjE2NTQ2Nzc1NTZ9.0xFLIf631G7PbXEL_ef04O3w6gjnu8lZ-gExsR9Wfto");
map.put("reference", "11905-OB");
map.put("status_id", "1");
map.put("status_property_id", "1");
map.put("property_type_id", "8");        
map.put("property_subtype_id", "2"); 
map.put("visibility_type_id", "2"); 
map.put("cadastral_reference", "9015608DF2891E0017AL"); 
map.put("price_sale", ""); 
map.put("price_rent", "95"); 
map.put("community_costs", ""); 
map.put("ibi_costs", ""); 
map.put("traspass", ""); 
map.put("orientation_id", "6"); 
map.put("energy_clasification_id", "6"); 
map.put("co2_release_class_id", "2");
map.put("conservation_state_id", "4");
testList.add(map);

HashMap<String, String> map2 = new HashMap<String, String>();
map2.put("property_id", "62aafcb53e575f7b21a16dfe");
map2.put("fuente_origen", "1123123");
map2.put("agency_id", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0aW1lIjoiV2VkIEp1biAwOCAyMDIyIDEwOjM5OjE2IEdNVCswMjAwIChob3JhIGRlIHZlcmFubyBkZSBFdXJvcGEgY2VudHJhbCkiLCJ1c2VySWQiOiI2Mjk0YmM3ZGU1ODVlODhiODYxNzYzZDAiLCJpYXQiOjE2NTQ2Nzc1NTZ9.0xFLIf631G7PbXEL_ef04O3w6gjnu8lZ-gExsR9Wfto");
map2.put("reference", "11906-OB");
map2.put("status_id", "1");
map2.put("status_property_id", "1");
map2.put("property_type_id", "8");        
map2.put("property_subtype_id", "2"); 
map2.put("visibility_type_id", "2"); 
map2.put("cadastral_reference", "9015608DF2891E0018AL"); 
map2.put("price_sale", ""); 
map2.put("price_rent", "195"); 
map2.put("community_costs", ""); 
map2.put("ibi_costs", ""); 
map2.put("traspass", ""); 
map2.put("orientation_id", "6"); 
map2.put("energy_clasification_id", "6"); 
map2.put("co2_release_class_id", "2");
map2.put("conservation_state_id", "4");
testList.add(map2);

String result = ai.updateProperty(testList);
```


# DELETE

```
ArrayList<String> testList = new ArrayList<String>(); 
testList.add("62aafcb53e575f7b21a16dfd");
String result = ai.deleteProperty(testList);
```