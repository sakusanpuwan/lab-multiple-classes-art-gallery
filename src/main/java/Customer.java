import java.util.ArrayList;

public class Customer {
    private String name;
    private double wallet;
    private ArrayList<Artwork> artworks;

    public Customer(String name,double wallet){
        this.name = name;
        this.wallet = wallet;
        this.artworks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public void buyArtwork(Artwork artwork, Gallery gallery){
        if (wallet >= artwork.getPrice()){
            wallet -= artwork.getPrice();
            gallery.artworkSold(artwork);
            artworks.add(artwork);
        }
    }

    public void getArtworks(){
        for (Artwork artwork: artworks) {
            System.out.println(artwork.getTitle());
        }

    }
}
