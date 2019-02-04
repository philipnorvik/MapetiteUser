package Controller;

import Model.Recept;
import ViewModels.*;
import Connect.*;

public class Controller {

    Recept recept = new Recept();
    int numberOfRecept = 5;

    for(int i = 0; i < numberOfRecept; i++) {
        int randomNr = recept.nextInt(getRecept.size());
        String randomElement = getRecept.get(randomNr);
    }
}
}
