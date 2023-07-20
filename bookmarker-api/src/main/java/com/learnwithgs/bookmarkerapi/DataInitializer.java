package com.learnwithgs.bookmarkerapi;

import com.learnwithgs.bookmarkerapi.domain.Bookmark;
import com.learnwithgs.bookmarkerapi.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookmarkRepository repository;


    @Override
    public void run(String... args)  {

        repository.save(new Bookmark(null, "System Design", "https://www.systemdesign.com", Instant.now()));
        repository.save(new Bookmark(null, "Coding at Google", "http://www.google.io", Instant.now()));
        repository.save(new Bookmark(null, "Design Data Intensive Applications", "http://www.data.io", Instant.now()));
        repository.save(new Bookmark(null, "Born a crime", "htt://www.travernoah.com", Instant.now()));
        repository.save(new Bookmark(null, "System Design", "https://www.systemdesign.com", Instant.now()));
        repository.save(new Bookmark(null, "Coding at Google", "http://www.google.io", Instant.now()));
        repository.save(new Bookmark(null, "Design Data Intensive Applications", "http://www.data.io", Instant.now()));
        repository.save(new Bookmark(null, "Born a crime", "htt://www.travernoah.com", Instant.now()));        repository.save(new Bookmark(null, "System Design", "https://www.systemdesign.com", Instant.now()));
        repository.save(new Bookmark(null, "Coding at Google", "http://www.google.io", Instant.now()));
        repository.save(new Bookmark(null, "Design Data Intensive Applications", "http://www.data.io", Instant.now()));
        repository.save(new Bookmark(null, "Born a crime", "htt://www.travernoah.com", Instant.now()));

    }
}
