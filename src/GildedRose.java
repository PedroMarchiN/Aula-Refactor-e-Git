public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        for (int i = 0; i < items.length; i++) {
            switch (items[i].name) {
                case "Backstage passes to a TAFKAL80ETC concert" -> caseBackstagePasses(i);
                case "Sulfuras, Hand of Ragnaros" -> caseSulfurasRagnaros(i);
                case "Aged Brie" -> caseAgedBrie(i);
                case "Eternal Artifact" -> caseEternalArtifact(i);
                case "Conjured Mana Cake" -> caseConjuredManaCake(i);
                case "Perishable Fruit" -> casePerishableFruit(i);
                case "Elixir of the Mongoose" -> caseElixirMongoose(i);
                case "+5 Dexterity Vest" -> caseDexterityVest(i);
            }
            ensureQualityBounds(i);
        }
    }





    private void caseAgedBrie(int i){
    }

    private void caseDexterityVest(int i){
    }

    private void caseSulfurasRagnaros(int i){
    }

    private void casePerishableFruit(int i){
    }

    private void caseElixirMongoose(int i){
    }

    private void caseEternalArtifact(int i) {
    }

    private void caseConjuredManaCake(int i) {
    }

    private void caseBackstagePasses(int i) {
    }

    private boolean isQualityOverZero(int i) {
        return items[i].quality > 0;
    }

    private boolean isQualityUnderLimit(int i) {
        return items[i].quality < 50;
    }

    private void ensureQualityBounds(int i) {
        if (items[i].quality > 50 && !items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
            items[i].quality = 50;
        }
        if (items[i].quality < 0) {
            items[i].quality = 0;
        }
    }
}