package com.jenish.devtrack;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class DailyEntryController {
    private DailyEntryService service = new DailyEntryService();

    @GetMapping("/hello")
    public String hello() {
        return "DevTrack is alive!";
    }
    @PostMapping("/entry")
public String saveEntry(@RequestParam int slider, 
                        @RequestParam int score,
                        @RequestParam String note) {
    
    DailyEntry entry = new DailyEntry(slider, score, note);
service.addEntry(entry);
return "Saved! Mode=" + entry.getMode();
}
    @GetMapping("/entries")
    public List<DailyEntry> getAllEntries() {
        return service.getAllEntries();
}

}