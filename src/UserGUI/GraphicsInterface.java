package UserGUI;

import java.awt.*;

public class GraphicsInterface {

    public GraphicsInterface() {
        Frame frame = new Frame();

        frame.add(three());
        frame.setVisible(true);
    }

    public Panel one() {
        Panel p = new Panel(0, 0, 600, 600, Color.WHITE);


        p.add(new Panel(167, 129, 265, 150, Color.red));
        p.add(new Text("title",242, 300, 117, 33));
        p.add(new Text("portions: " + "someMethod", 167, 353, 105, 52));
        p.add(new Text("time: " + "someMethod", 167, 415, 105, 52));

        p.add(new Button("randomize", 134, 484, 332, 50));

        return p;
    }

    public Panel two() {
        Panel p = new Panel(0, 0, 600, 600, Color.WHITE);
        p.add(new Text("Din matvecka", 221, 47, 160, 19));
        p.add(new Button("mån", 134, 92, 332, 59));
        p.add(new Button("tis", 134, 160, 332, 59));
        p.add(new Button("ons", 134, 228, 332, 59));
        p.add(new Button("tor", 134, 296, 332, 59));
        p.add(new Button("fre", 134, 364, 332, 59));
        p.add(new Button("lör", 134, 432, 332, 59));
        p.add(new Button("sön", 134, 500, 332, 59));
        return p;
    }

    public Panel three() {
        Panel p = new Panel(0, 0, 600, 600, Color.WHITE);
        p.add(new Text("title", 300, 66, 138, 39));
        p.add(new Text("time", 205, 124, 71, 16));
        p.add(new Text("portions", 300, 124, 71, 16));
        p.add(new Text("rating", 395, 124, 71, 16));
        p.add(new Text("Ingredients", 205, 181, 103, 17));
        p.add(new Text("instructions", 394, 181, 103, 17));
        p.add(new TextBox("listOfIngredients", 205, 200, 175, 342, Color.lightGray));
        p.add(new TextBox("listOfInStructions\norigdsgijsdpfos\ndjfsodkmfåsdmg\nsdomvxdoövmdxävmxd", 394, 200, 175, 342, Color.lightGray));

        return p;
    }
}