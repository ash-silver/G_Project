package com.example.g_project.service;

import com.example.g_project.dto.ReadingRequest;
import com.example.g_project.dto.ReadingResponse;
import com.example.g_project.entity.Reading;
import com.example.g_project.entity.ReadingRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReadingService {
    private final ReadingRepository readingRepository;

    @Transactional
    public void createReading(ReadingRequest request){
        readingRepository.save(request.readingEntity());
    }

//    public ReadingResponse findReading(int readingId){
//        return new ReadingResponse(readingRepository.findByReadingCD(readingId));
//    }

    public ReadingResponse findById(int readingId){
        return new ReadingResponse(readingRepository.findById(readingId));
    }

    public void editReading(int readingId, ReadingRequest request) {
        Reading entity = readingRepository.findById(readingId);
        System.out.println(entity.getReadingTitle());
//        entity.ReadingUpdate(
//                request.getMemberCD()
//                , request.getBookCD()
//                , request.getReadingAuthor()
//                , request.getReadingPublisher()
//                , request.getReadingStart()
//                , request.getReadingEnd()
//                , request.getReadingTitle()
//                , request.getReadingContent()
//                , request.getReadingImpressive()
//        );
        int memberCD = request.getMemberCD();
        entity.setMemberCD(memberCD);
        int bookCD = request.getBookCD();
        entity.setBookCD(bookCD);
        String readingAuthor = request.getReadingAuthor();
        entity.setReadingAuthor(readingAuthor);
        String readingPublisher = request.getReadingPublisher();
        entity.setReadingPublisher(readingPublisher);
        String readingStart = request.getReadingStart();
        entity.setReadingStart(readingStart);
        String readingEnd = request.getReadingEnd();
        entity.setReadingEnd(readingEnd);
        String readingTitle = request.getReadingTitle();
        entity.setReadingTitle(readingTitle);
        String readingContent = request.getReadingContent();
        entity.setReadingContent(readingContent);
        String readingImpressive = request.getReadingImpressive();
        entity.setReadingImpressive(readingImpressive);
//        entity.ReadingUpdate(request.getMemberCD()
//                , request.getBookCD()
//                , request.getReadingAuthor()
//                , request.getReadingPublisher()
//                , request.getReadingStart()
//                , request.getReadingEnd()
//                , request.getReadingTitle()
//                , request.getReadingContent()
//                , request.getReadingImpressive());
//        readingRepository.save(request.readingEntity());
    }

//    public void deleteById(int readingId){
//        ReadingRepository.deleteById(readingId);
//    }
}
