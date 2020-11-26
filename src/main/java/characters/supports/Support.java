package characters.supports;

import characters.Player;
import tools.ITool;

public class Support {
    private ITool tool;
    private String name;

    public Support(String name, ITool tool) {
        this.name = name;
        this.tool = tool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ITool getTool() {
        return tool;
    }

    public void setTool(ITool tool) {
        this.tool = tool;
    }

    public void support(Player target) {
        tool.apply(target);
    }
}
