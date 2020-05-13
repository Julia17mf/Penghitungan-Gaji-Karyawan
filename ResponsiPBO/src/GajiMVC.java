public class GajiMVC {
    MainDAO mainDAO                 = new MainDAO();
    GajiModel gajiModel             = new GajiModel();
    GajiView gajiView               = new GajiView();
    GajiController gajiController   = new GajiController(mainDAO, gajiModel, gajiView);
}
