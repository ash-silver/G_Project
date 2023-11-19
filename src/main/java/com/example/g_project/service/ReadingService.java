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

    @Transactional
    public void editReading(int readingId, ReadingRequest request) {
        Reading entity = readingRepository.findById(readingId);
//        entity.ReadingUpdate(readingId, reqeust);
        entity.ReadingUpdate(
                request.getMemberCD()
                , request.getBookCD()
                , request.getReadingAuthor()
                , request.getReadingPublisher()
                , request.getReadingStart()
                , request.getReadingEnd()
                , request.getReadingTitle()
                , request.getReadingContent()
                , request.getReadingImpressive()
        );

//        entity.setMemberCD(request.getMemberCD());
//        entity.setBookCD(request.getBookCD());
//        entity.setReadingAuthor(request.getReadingAuthor());
//        entity.setReadingPublisher(request.getReadingPublisher());
//        entity.setReadingStart(request.getReadingStart());
//        entity.setReadingEnd(request.getReadingEnd());
//        entity.setReadingTitle(request.getReadingTitle());
//        entity.setReadingContent(request.getReadingContent());
//        entity.setReadingImpressive(request.getReadingImpressive());

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
