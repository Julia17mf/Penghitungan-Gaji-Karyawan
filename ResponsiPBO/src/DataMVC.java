public class DataMVC {
    MainDAO mainDAO             = new MainDAO();
    DataModel dataModel         = new DataModel();
    DataView dataView           = new DataView();
    DataController dataController   = new DataController(mainDAO, dataModel, dataView);
}
