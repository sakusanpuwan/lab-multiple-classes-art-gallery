import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> artworks;

    public Gallery(String name, double till){
        this.artworks = new ArrayList<>();
        this.name = name;
        this.till = till;
    }

    public double getTill() {
        return till;
    }

    public String getName() {
        return name;
    }

    public void addArtwork(Artwork artwork){
        this.artworks.add(artwork);
    }

    public void artworkSold(Artwork artwork){
        till += artwork.getPrice();
        this.artworks.remove(artwork);
    }

    public void getArtworks(){
        for (Artwork artwork: artworks) {
            System.out.println(artwork.getTitle());
        }

    }

    public double stockTake(){
        double totalValue = 0;
        for (Artwork artowrk: artworks){
            totalValue += artowrk.getPrice();
        }
        return totalValue;
    }



}
