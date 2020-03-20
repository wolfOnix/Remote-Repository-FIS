package krobert.upt.fis.l5.processors;

import krobert.upt.fis.l5.documents.Document;
import java.util.ArrayList;

public interface Procesor {
    int proceseaza(ArrayList<Document> documente);
}