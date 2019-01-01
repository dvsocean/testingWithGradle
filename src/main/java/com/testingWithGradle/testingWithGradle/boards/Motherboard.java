package com.testingWithGradle.testingWithGradle.boards;

public class Motherboard extends ChipsetInitializer {

    private String motherboardName;
    private String motherboardColor;
    private String motherboardType;
    private String motherboardEngine;
    private String motherboardBrand;
    private String motherboardModel;
    private WireHarness wireHarness = new WireHarness();
    private Chipset chipset = new Chipset(createNewIndexNode(), createNewIndexNode(), createChipsetFamily(), createNodeFamily(), createTags());

    public Motherboard(String name) {
        this.motherboardName = name;
    }

    public Motherboard() {
        //Empty constructor is needed so I can send updated objects via rest
    }

    public Chipset getChipset() {
        return chipset;
    }

    public void setChipset(Chipset chipset) {
        this.chipset = chipset;
    }

    public String getMotherboardName() {
        return motherboardName;
    }

    public void setMotherboardName(String motherboardName) {
        this.motherboardName = motherboardName;
    }

    public String getMotherboardColor() {
        return motherboardColor;
    }

    public void setMotherboardColor(String motherboardColor) {
        this.motherboardColor = motherboardColor;
    }

    public String getMotherboardType() {
        return motherboardType;
    }

    public void setMotherboardType(String motherboardType) {
        this.motherboardType = motherboardType;
    }

    public String getMotherboardEngine() {
        return motherboardEngine;
    }

    public void setMotherboardEngine(String motherboardEngine) {
        this.motherboardEngine = motherboardEngine;
    }

    public String getMotherboardBrand() {
        return motherboardBrand;
    }

    public void setMotherboardBrand(String motherboardBrand) {
        this.motherboardBrand = motherboardBrand;
    }

    public WireHarness getWireHarness() {
        return wireHarness;
    }

    public void setWireHarness(WireHarness wireHarness) {
        this.wireHarness = wireHarness;
    }

    public String getMotherboardModel() {
        return motherboardModel;
    }

    public void setMotherboardModel(String motherboardModel) {
        this.motherboardModel = motherboardModel;
    }
}//End of class
