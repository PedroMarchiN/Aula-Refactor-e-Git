public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    /*
        Primeiramente tentei dividir em subrotinas, mas logo percebi que fazia mais sentido separar por item,
        visto que tem itens que não mudam quase nada e outros que passam por diversas verificações. Maior parte dos
        if eram checando os nomes dos itens, então só de fazer o switch case o código já ficou bem mais limpo.
     */
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
        items[i].sellIn--;

        if (items[i].quality < 50) {
            items[i].quality++;
        }

        if (items[i].sellIn < 0 && items[i].quality < 50) {
            items[i].quality++;
        }
    }

    private void caseDexterityVest(int i){
        items[i].sellIn--;

        if (items[i].quality > 0) {
            items[i].quality--;
        }

        if (items[i].sellIn < 0 && items[i].quality > 0) {
            items[i].quality--;
        }
    }

    private void caseSulfurasRagnaros(int i){
        //it looks like this is one does nothing :)
    }

    private void casePerishableFruit(int i){
        items[i].sellIn--;

        if (items[i].quality > 0) {
            items[i].quality -= 2;
        }

        if (items[i].sellIn < 0 && items[i].quality > 0) {
            items[i].quality -= 2;
        }
    }

    private void caseElixirMongoose(int i){
        items[i].sellIn--;

        if (items[i].quality > 0) {
            items[i].quality--;
        }

        if (items[i].sellIn < 0 && items[i].quality > 0) {
            items[i].quality--;
        }
    }

    private void caseEternalArtifact(int i) {

        if (items[i].quality > 0 && items[i].quality < 50) {
            items[i].quality++;
        }

        if (items[i].sellIn % 2 == 0) {
            items[i].quality++;
        }

    }

    private void caseConjuredManaCake(int i) {
        items[i].sellIn--;

        if (items[i].quality > 0) {
            items[i].quality += 2;
        }

        if (items[i].sellIn < 0 && items[i].quality > 0) {
            items[i].quality -= 2;
        }
    }

    private void caseBackstagePasses(int i) {
        items[i].sellIn--;

        if (items[i].quality < 50) {
            items[i].quality++;
            if (items[i].sellIn < 10 && items[i].quality < 50) {
                items[i].quality++;
            }
            if (items[i].sellIn < 5 && items[i].quality < 50) {
                items[i].quality++;
            }
        }
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