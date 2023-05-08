package edu.guilford;

public class Canine extends Creature {
    
        public Canine(String scientificName, String commonName, int avgWeight, int avglifespan, String diet, String habitat) {
            super(scientificName, commonName, avgWeight, avglifespan, diet, habitat);
        }
        //setter for conservationStatus using the conservationStatus method
        public void setConservationStatus() {
            conservationStatus = conservationStatus();
        }

        public void noiseMade() {
            System.out.println("Woof");
        }
    
}
