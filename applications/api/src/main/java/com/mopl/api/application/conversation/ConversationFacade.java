package com.mopl.api.application.conversation;

import com.mopl.api.interfaces.api.user.UserCreateRequest;
import com.mopl.domain.model.user.AuthProvider;
import com.mopl.domain.model.user.UserModel;
import com.mopl.domain.service.user.UserService;
import java.util.Locale;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public  class ConversationFacade {

//    private final ConversationService conversationService;

//    @Transactional
//    public ConversationModel create(ConversationCreateRequest conversationCreateRequest) {
//
//        // conversation에 맞게 수정 필요.
//        //conversationCreateRequest에 상대방의 userId만 온다.
//        //최종적으로는 conversationdto에 converstaion id와 with에 상대방 정보
//        //lastestMessage에 메시지 내용과 보낸 사용자, 받는 사용자
//        //마지막에 읽지 않은 메시지가 있는지 true/false 여부 로 흘러가는 걸 생각하기
//
//        ConversationModel conversationModel = conversationModel.create(
//
//        );
//
//        return conversationService.create(conversationModel);
//    }

//    @Transactional(readOnly = true)
//    public ConversationModel getConversation(UUID conversationId) {
//        return conversationService.getById(conversationId);
//    }




}