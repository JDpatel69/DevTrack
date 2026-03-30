package com.jenish.devtrack;

import java.util.ArrayList;
import java.util.List;

public class DailyEntryService{

        private List<DailyEntry> entries = new ArrayList<>();

        public void addEntry(DailyEntry entry){
            entries.add(entry);
        }

       public List<DailyEntry> getAllEntries(){
        return entries;
       } 
}