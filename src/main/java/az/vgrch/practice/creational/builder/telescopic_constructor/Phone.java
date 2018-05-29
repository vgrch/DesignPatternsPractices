package az.vgrch.practice.creational.builder.telescopic_constructor;

public class Phone {

    private String screenResolution;
    private String model;
    private String camera;
    private String battery;
    private boolean LTEsupport;

    public Phone(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public Phone(String screenResolution, String model) {
        this.screenResolution = screenResolution;
        this.model = model;
    }

    public Phone(String screenResolution, String model, String camera) {
        this.screenResolution = screenResolution;
        this.model = model;
        this.camera = camera;
    }

    public Phone(String screenResolution, String model, String camera, String battery) {
        this.screenResolution = screenResolution;
        this.model = model;
        this.camera = camera;
        this.battery = battery;
    }

    public Phone(String screenResolution, String model, String camera, String battery, boolean LTEsupport) {
        this.screenResolution = screenResolution;
        this.model = model;
        this.camera = camera;
        this.battery = battery;
        this.LTEsupport = LTEsupport;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public boolean isLTEsupport() {
        return LTEsupport;
    }

    public void setLTEsupport(boolean LTEsupport) {
        this.LTEsupport = LTEsupport;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Phone{");
        sb.append("screenResolution='").append(screenResolution).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", camera='").append(camera).append('\'');
        sb.append(", battery='").append(battery).append('\'');
        sb.append(", LTEsupport=").append(LTEsupport);
        sb.append('}');
        return sb.toString();
    }
}
