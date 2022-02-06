package catalog;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Catalog {
    private List<CatalogItem> catalogItems=new ArrayList<>();

    public void addItem(CatalogItem catalogItem){
        catalogItems.add(catalogItem);
    }

    public void deleteItemByRegistrationNumber(String regNo){
        if(Validators.isBlank(regNo)){
            throw new IllegalArgumentException("Empty Registration Number");
        }
        for(int i=0;i<catalogItems.size();i++){
            CatalogItem catalogItem=catalogItems.get(i);
            if(catalogItem.getRegistrationNumber().equals(regNo)){
                catalogItems.remove(i);
                return;
            }
        }
        return;
    }


    public double averagePageNumberOver(int minNumberOfPages) {
        if(minNumberOfPages<=0){
            throw new IllegalArgumentException("Page number must be positive");
        }
        OptionalDouble avgOptional=  catalogItems.stream()
                .filter(ci->ci.numberOfPagesAtOneItem()>minNumberOfPages)
                .map(ci->ci.numberOfPagesAtOneItem())
                .mapToInt(Integer::intValue)
                .average();
        if (!avgOptional.isPresent()) {
            throw new IllegalArgumentException("No page");
        }
        return avgOptional.getAsDouble();


    }

    public int getFullLength() {
        return catalogItems.stream()
                .map(ci->ci.fullLengthAtOneItem())
                .mapToInt(Integer::intValue)
                .sum();
    }

    public int getAllPageNumber() {
        return catalogItems.stream()
                .map(ci->ci.numberOfPagesAtOneItem())
                .mapToInt(Integer::intValue)
                .sum();
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria){
        List<CatalogItem> foundItems=new ArrayList<>();
        for(CatalogItem catalogItem:catalogItems){
            if(searchCriteria.hasTitle() && !catalogItem.getTitles().contains(searchCriteria.getTitle())){
                continue;
            }
            if(searchCriteria.hasContributor() && !catalogItem.getContributors().contains(searchCriteria.getContributor())){
                continue;
            }
            foundItems.add(catalogItem);
        }

        return foundItems;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        return catalogItems.stream()
                .filter(ci->ci.hasPrintedFeature())
                .toList();
    }

    public List<CatalogItem> getAudioLibraryItems() {
        return catalogItems.stream()
                .filter(ci->ci.hasAudioFeature())
                .toList();
    }

    public List<CatalogItem> getCatalogItems() {
        return catalogItems;
    }
}
