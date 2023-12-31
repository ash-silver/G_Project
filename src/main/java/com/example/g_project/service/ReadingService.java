package com.example.g_project.service;

import com.example.g_project.dto.ReadingRequest;
import com.example.g_project.dto.ReadingResponse;
import com.example.g_project.entity.Reading;
import com.example.g_project.entity.ReadingRepository;
import jakarta.servlet.http.HttpSession;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class ReadingService {
    private final ReadingRepository readingRepository;

    @Transactional
    public void createReading(ReadingRequest request){
        readingRepository.save(request.readingEntity());
    }

    public ReadingResponse findById(int readingId){
        return new ReadingResponse(readingRepository.findById(readingId));
    }

    @Transactional
    public void editReading(int readingId, ReadingRequest request) {
        Reading entity = readingRepository.findById(readingId);
        entity.ReadingUpdate(
//                request.getMemberNickname()
                 request.getBookCD()
                , request.getReadingAuthor()
                , request.getReadingPublisher()
                , request.getReadingStart()
                , request.getReadingEnd()
                , request.getReadingTitle()
                , request.getReadingContent()
                , request.getReadingImpressive()
        );
    }
    public void deleteReading(int readingId){
        readingRepository.deleteById(readingId);
    }

    @Transactional
    public List<Reading> readingList(String memberNickname){
        List<Reading> readingList = readingRepository.findByMemberNickname(memberNickname);

        return readingList;
    }


}
