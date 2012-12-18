package org.gephi.graph.api;

import java.util.Map.Entry;

/**
 *
 * @author mbastian
 */
public interface Index<T extends Element> {

    public int count(Column column, Object value);

    public Iterable<T> get(Column column, Object value);

    public Iterable<Entry<Object, T>> get(Column column);

    public Number getMinValue(Column column);

    public Number getMaxValue(Column column);

    public Class<T> getIndexClass();

    public String getIndexName();
}
