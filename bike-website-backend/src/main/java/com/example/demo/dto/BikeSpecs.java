package com.example.demo.dto;

public class BikeSpecs {
    private int id;
    private String brand;
    private String model;
    private String sizes;
    private String colours;
    private String frame;
    private String fork;
    private String handlebar;
    private String grips;
    private String stem;
    private String seatpost;
    private String saddle;
    private String pedals;
    private String shifters;
    private String frontDerailleur;
    private String rearDerailleur;
    private String brakes;
    private String brakeLevers;
    private String cassette;
    private String chain;
    private String crankset;
    private String bottomBracket;
    private String rims;
    private String hubs;
    private String spokes;
    private String tires;
    private String extras;
    private String weight;
    
    public BikeSpecs() {
        // Default constructor
    }

    public BikeSpecs(int id, String brand, String model, String sizes, String colours,
            String frame, String fork, String handlebar, String grips,
            String stem, String seatpost, String saddle, String pedals,
            String shifters, String frontDerailleur, String rearDerailleur,
            String brakes, String brakeLevers, String cassette, String chain,
            String crankset, String bottomBracket, String rims, String hubs,
            String spokes, String tires, String extras, String weight) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.sizes = sizes;
		this.colours = colours;
		this.frame = frame;
		this.fork = fork;
		this.handlebar = handlebar;
		this.grips = grips;
		this.stem = stem;
		this.seatpost = seatpost;
		this.saddle = saddle;
		this.pedals = pedals;
		this.shifters = shifters;
		this.frontDerailleur = frontDerailleur;
		this.rearDerailleur = rearDerailleur;
		this.brakes = brakes;
		this.brakeLevers = brakeLevers;
		this.cassette = cassette;
		this.chain = chain;
		this.crankset = crankset;
		this.bottomBracket = bottomBracket;
		this.rims = rims;
		this.hubs = hubs;
		this.spokes = spokes;
		this.tires = tires;
		this.extras = extras;
		this.weight = weight;
	}
    
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSizes() {
        return sizes;
    }

    public String getColours() {
        return colours;
    }

    public String getFrame() {
        return frame;
    }

    public String getFork() {
        return fork;
    }

    public String getHandlebar() {
        return handlebar;
    }

    public String getGrips() {
        return grips;
    }

    public String getStem() {
        return stem;
    }

    public String getSeatpost() {
        return seatpost;
    }

    public String getSaddle() {
        return saddle;
    }

    public String getPedals() {
        return pedals;
    }

    public String getShifters() {
        return shifters;
    }

    public String getFrontDerailleur() {
        return frontDerailleur;
    }

    public String getRearDerailleur() {
        return rearDerailleur;
    }

    public String getBrakes() {
        return brakes;
    }

    public String getBrakeLevers() {
        return brakeLevers;
    }

    public String getCassette() {
        return cassette;
    }

    public String getChain() {
        return chain;
    }

    public String getCrankset() {
        return crankset;
    }

    public String getBottomBracket() {
        return bottomBracket;
    }

    public String getRims() {
        return rims;
    }

    public String getHubs() {
        return hubs;
    }

    public String getSpokes() {
        return spokes;
    }

    public String getTires() {
        return tires;
    }

    public String getExtras() {
        return extras;
    }

    public String getWeight() {
        return weight;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    public void setColours(String colours) {
        this.colours = colours;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public void setFork(String fork) {
        this.fork = fork;
    }

    public void setHandlebar(String handlebar) {
        this.handlebar = handlebar;
    }

    public void setGrips(String grips) {
        this.grips = grips;
    }

    public void setStem(String stem) {
        this.stem = stem;
    }

    public void setSeatpost(String seatpost) {
        this.seatpost = seatpost;
    }

    public void setSaddle(String saddle) {
        this.saddle = saddle;
    }

    public void setPedals(String pedals) {
        this.pedals = pedals;
    }

    public void setShifters(String shifters) {
        this.shifters = shifters;
    }

    public void setFrontDerailleur(String frontDerailleur) {
        this.frontDerailleur = frontDerailleur;
    }

    public void setRearDerailleur(String rearDerailleur) {
        this.rearDerailleur = rearDerailleur;
    }

    public void setBrakes(String brakes) {
        this.brakes = brakes;
    }

    public void setBrakeLevers(String brakeLevers) {
        this.brakeLevers = brakeLevers;
    }

    public void setCassette(String cassette) {
        this.cassette = cassette;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public void setCrankset(String crankset) {
        this.crankset = crankset;
    }

    public void setBottomBracket(String bottomBracket) {
        this.bottomBracket = bottomBracket;
    }

    public void setRims(String rims) {
        this.rims = rims;
    }

    public void setHubs(String hubs) {
        this.hubs = hubs;
    }

    public void setSpokes(String spokes) {
        this.spokes = spokes;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}

