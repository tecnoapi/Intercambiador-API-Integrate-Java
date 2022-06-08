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
map.put("fuente_origen", "1");
map.put("agency_id", "123");
map.put("propietario", "123");
map.put("status_id", "1");
map.put("status_property_id", "1");
map.put("cadastral_reference", "1111");        
testList.add(map);

HashMap<String, String> map2 = new HashMap<String, String>();
map2.put("fuente_origen", "1");
map2.put("agency_id", "1234");
map2.put("propietario", "1234");
map2.put("status_id", "1");
map2.put("status_property_id", "1");
map2.put("cadastral_reference", "2222");
testList.add(map2);

String result = ai.addProperty(testList);
```


# PUT

```
ArrayList<HashMap<String, String>> testList = new ArrayList<HashMap<String, String>>();        
        
HashMap<String, String> map = new HashMap<String, String>();
map.put("_id", "000000000000aaaaaaaaaaaa");
map.put("fuente_origen", "1");
map.put("agency_id", "123");
map.put("propietario", "123");
map.put("status_id", "1");
map.put("status_property_id", "1");
map.put("cadastral_reference", "1111");        
testList.add(map);

HashMap<String, String> map2 = new HashMap<String, String>();
map2.put("_id", "000000000000bbbbbbbbbbbb");
map2.put("fuente_origen", "1");
map2.put("agency_id", "1234");
map2.put("propietario", "1234");
map2.put("status_id", "1");
map2.put("status_property_id", "1");
map2.put("cadastral_reference", "2222");
testList.add(map2);

String result = ai.updateProperty(testList);
```


# DELETE

```
ArrayList<String> testList = new ArrayList<String>(); 
testList.add("000000000000aaaaaaaaaaaa");
String result = ai.deleteProperty(testList);
```