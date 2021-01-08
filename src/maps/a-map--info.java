package maps;
/*
 --------------------------------------------------Map------------------------------------------------------------------

 A Map is an object that maps keys to values. A map cannot contain duplicate keys: Each key can map to at most one value.
 It models the mathematical function abstraction. The Map interface includes methods for basic operations (such as put,
  get, remove, containsKey, containsValue, size, and empty), bulk operations (such as putAll and clear), and collection
  views (such as keySet, entrySet, and values).
  The Java platform contains three general-purpose Map implementations:
   === HashMap, TreeMap, and LinkedHashMap. ===
  Their behavior and performance are precisely analogous to HashSet, TreeSet, and LinkedHashSet, as described in The
  Set Interface section.

    int size() ---------------------------------------------------------------------------------------------------------

         * Returns the number of key-value mappings in this map.  If the
         * map contains more than <tt>Integer.MAX_VALUE</tt> elements, returns
         * <tt>Integer.MAX_VALUE</tt>.
         * @return the number of key-value mappings in this map

   boolean isEmpty() --------------------------------------------------------------------------------------------------

          * Returns <tt>true</tt> if this map contains no key-value mappings.

   boolean containsKey(Object key)--------------------------------------------------------------------------------------

         * Returns true if this map contains a mapping for the specified

    boolean containsValue(Object value) --------------------------------------------------------------------------------

         * Returns true if this map maps one or more keys to the specified value.

    V get(Object key) --------------------------------------------------------------------------------------------------

         * Returns the value to which the specified key is mapped,
         * or  null if this map contains no mapping for the key.

     V put(K key, V value) ---------------------------------------------------------------------------------------------

          * Associates the specified value with the specified key in this map
          * Returns the previous value associated with key, or
          * null if there was no mapping for key

     V remove(Object key) ----------------------------------------------------------------------------------------------

          * Removes the mapping for a key from this map if it is present
          * Returns the value to which this map previously associated the key,
          * or null if the map contained no mapping for the key.

      void putAll(Map<? extends K, ? extends V> m)----------------------------------------------------------------------

          * Copies all of the mappings from the specified map to this map
          *The behavior of this operation is undefined if the
          * specified map is modified while the operation is in progress.

       void clear()-----------------------------------------------------------------------------------------------------

          * Removes all of the mappings from this map (optional operation).
          * The map will be empty after this call returns.

        Set<K> keySet() ------------------------------------------------------------------------------------------------

          * Returns a {@link Set} view of the keys contained in this map.
          * The set is backed by the map, so changes to the map are
          * reflected in the set, and vice-versa.

          Collection<V> values() ---------------------------------------------------------------------------------------

          * Returns a  Collection view of the values contained in this map.
          * The collection is backed by the map, so changes to the map are
          * reflected in the collection, and vice-versa.

        Set<Map.Entry<K, V>> entrySet() -------------------------------------------------------------------------------

          * Returns a Set  view of the mappings contained in this map.
          * The set is backed by the map, so changes to the map are
          * reflected in the set, and vice-versa.


* */