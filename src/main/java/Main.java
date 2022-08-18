public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Sakusan",1000);
        Artist artist1 = new Artist("Da Vinci");
        Gallery gallery1 = new Gallery("Louvre",2000);
        Artwork artwork1 = new Artwork("Mona Lisa","Da Vinci",500,1234);
        Artwork artwork2 = new Artwork("Vitruvian Man","Da Vinci",300,2345);
        Artwork artwork3 = new Artwork("Last Supper","Da Vinci",250,3456);

        gallery1.addArtwork(artwork1);
        gallery1.addArtwork(artwork2);
        gallery1.addArtwork(artwork3);

        customer1.buyArtwork(artwork1,gallery1);

        System.out.println(customer1.getWallet());
        System.out.println(gallery1.getTill());

        customer1.getArtworks();
        gallery1.getArtworks();

        System.out.println(gallery1.stockTake());




    }
}
