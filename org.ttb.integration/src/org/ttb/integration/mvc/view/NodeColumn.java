package org.ttb.integration.mvc.view;

/**
 * Enum describing columns in nodes table.
 * 
 * @author Piotr Dorobisz
 * 
 */
public enum NodeColumn {

    ENABLED("Enabled", 60), NODE_NAME("Name", 150), TYPE("Type", 70), COOKIE("Cookie", 150);

    private final String name;
    private final int width;

    private NodeColumn(String name, int width) {
        this.name = name;
        this.width = width;
    }

    public static NodeColumn getByIndex(int index) {
        for (NodeColumn column : NodeColumn.values()) {
            if (column.ordinal() == index)
                return column;
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

}
