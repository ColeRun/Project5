package edu.guilford;

public class Primate extends Creature {
    
        public Primate(String scientificName, String commonName, int avgWeight, int avglifespan, String diet, String habitat) {
            super(scientificName, commonName, avgWeight, avglifespan, diet, habitat);
            
        }
        //setter for conservationStatus using the conservationStatus method
        public void setConservationStatus() {
            conservationStatus = conservationStatus();
        }

        public void noiseMade() {
            System.out.println("Ooh ooh ahh ahh");
        }
    
}
