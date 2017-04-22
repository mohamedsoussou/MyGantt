package helpper;

import entities.AffEquipement;
import entities.Casee;
import java.util.List;

import javafx.scene.control.TableView;

public class CaseeHelpper extends AbstractFxHelper<Casee> {

    private static AbstractFxHelperItem[] titres;

    static {
        titres = new AbstractFxHelperItem[]{
            new AbstractFxHelperItem("ID", "id")
        };
    }

    public CaseeHelpper(TableView<Casee> table, List<Casee> list) {
        super(titres, table, list);
    }

    public CaseeHelpper(TableView<Casee> table) {
        super(titres, table);
    }

}
