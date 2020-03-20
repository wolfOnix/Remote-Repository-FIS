package krobert.upt.fis.l5.processors;

import krobert.upt.fis.l5.documents.Document;
import java.util.ArrayList;

public class ProcesorCompus implements Procesor {
    private ArrayList<Procesor> procesoare = new ArrayList<>();

    public void adaugaProcesor(Procesor procesor) {
        procesoare.add(procesor);
    }

    @Override
    public int proceseaza(ArrayList<Document> documente) {
        int res = 0;

        for (Procesor procesor : procesoare) {
            res += procesor.proceseaza(documente);
        }

        return res;
    }
}
