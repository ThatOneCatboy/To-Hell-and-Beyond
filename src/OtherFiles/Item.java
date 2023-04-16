package OtherFiles;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public abstract class Item {
    private final ItemRarityEnum rarity;
    private final EnumSet<ItemTypeEnum> types = EnumSet.noneOf(ItemTypeEnum.class);
    private final int levelNeeded;
    private final String name;
    private final int id;

    public Item(String itemName, int itemID, int level, ItemRarityEnum inputRarity, ItemTypeEnum... typesArray) {
        name = itemName;
        id = itemID;
        levelNeeded = level;
        rarity = inputRarity;
        types.addAll(Arrays.asList(typesArray));
    }

    public ItemRarityEnum getRarity() {
        return rarity;
    }

    public Set<ItemTypeEnum> getTypes() {
        return Collections.unmodifiableSet(types);
    }

    public int getLevelNeeded() {
        return levelNeeded;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }
}
