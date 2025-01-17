package com.example.cai.kh5.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();


    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    public  int COUNT = 25;

   /* static {
        // Add some sample items.


        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }*/
   public DummyContent(int n,String news[],int imgi[])
    {
        COUNT=n;
        for(int i=1;i<n;i++)
        {
            addItem(createDummyItem(i,news[i-1],imgi[i-1]));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static DummyItem createDummyItem(int position,String s,int imgid1) {
        //return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
        return new DummyItem(String.valueOf(position), s,makeDetails(position), imgid1);
    }


    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;
        public final int imgid;

        public DummyItem(String id, String content, String details, int imgid) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.imgid = imgid;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
