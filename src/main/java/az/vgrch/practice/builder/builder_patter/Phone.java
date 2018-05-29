package az.vgrch.practice.builder.builder_patter;

public class Phone {

    private String screenResolution;
    private String model;
    private String camera;
    private String battery;
    private boolean LTEsupport;

    public static class Builder{
        private String screenResolution;
        private String model;
        private String camera;
        private String battery;
        private boolean LTEsupport;

        public Builder screenResolution(String screenResolution){
            this.screenResolution = screenResolution;
            return this;
        }

        public Builder model(String model){
            this.model = model;
            return this;
        }

        public Builder camera(String camera){
            this.camera = camera;
            return this;
        }

        public Builder battery(String battery){
            this.battery = battery;
            return this;
        }

        public Builder LTEsupport(boolean LTEsupport){
            this.LTEsupport = LTEsupport;
            return this;
        }


    }

    public Phone(Builder builder) {
    this.screenResolution = builder.screenResolution;
    this.battery = builder.battery;
    this.camera = builder.camera;
    this.LTEsupport = builder.LTEsupport;
    this.model = builder.model;
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
