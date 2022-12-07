package n27.n2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapNames implements Map<String, String> {
    private Map<String, String> map = new HashMap<String, String>();
    public static void main(String[] args) {
        MapNames mapNames = new MapNames();
        //fill map
        mapNames.put("Misha", "Ivanov");
        mapNames.put("Grisha", "Petrov");
        mapNames.put("Tima", "Petrov");
    }

    public HashMap<String, String> createMap() {
        return new HashMap<String, String>(map);
    }

    public int getSameFirstNameCount(String firstName) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(firstName)) {
                count++;
            }
        }
        return count;
    }

    public int getSameLastNameCount(String lastName) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    @Override
    public String get(Object key) {
        return map.get(key);
    }

    @Override
    public String put(String key, String value) {
        return map.put(key, value);
    }

    @Override
    public String remove(Object key) {
        return map.remove(key);
    }

    @Override
    public void putAll(Map<? extends String, ? extends String> m) {
        map.putAll(m);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Set<String> keySet() {
        return map.keySet();
    }

    @Override
    public Collection<String> values() {
        return map.values();
    }

    @Override
    public Set<Entry<String, String>> entrySet() {
        return map.entrySet();
    }
}
