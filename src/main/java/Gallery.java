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

    public void addArtwork(Artwork artwork){
        this.artworks.add(artwork);
    }

    public void artworkSold(Artwork artwork){
        till += artwork.getPrice();
    }

}
