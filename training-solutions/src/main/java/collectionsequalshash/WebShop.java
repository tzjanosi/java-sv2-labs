package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
    List<Product> productList = new ArrayList<>();

    public void add(Product productToAdd){
        productList.add(productToAdd);
    }

    public int findHowMany(Product product){
        int howMany=0;
        for(Product productToCheck:productList){
            if(productToCheck.equals(product)){
                howMany++;
            }
        }
        return howMany;
    }

    public static void main(String[] args) {
        WebShop webShop=new WebShop();
        webShop.add(new Product("Hajszáritó","421-869"));
        webShop.add(new Product("Esernyő","425-769"));
        webShop.add(new Product("Locsolókanna","475-469"));
        webShop.add(new Product("Turmixgép","666-1976"));
        webShop.add(new Product("Konyhai Robotgép","666-1976"));
        webShop.add(new Product("Nyakkendő","321-1984"));
        webShop.add(new Product("CuisineArt","666-1976"));
        webShop.add(new Product("Food Processor","666-1976"));

        System.out.println(webShop.findHowMany(new Product("napernyő","666-976")));
        System.out.println(webShop.findHowMany(new Product("ernyő","425-769")));
        System.out.println(webShop.findHowMany(new Product("Keverőgép","666-1976")));
    }
}
