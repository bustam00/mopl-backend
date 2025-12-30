package com.mopl.domain.model.conversation;


import com.mopl.domain.model.base.BaseModel;
import com.mopl.domain.model.base.BaseUpdatableModel;
import com.mopl.domain.model.user.AuthProvider;
import com.mopl.domain.model.user.Role;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ConversationModel extends BaseUpdatableModel {

    //userSummaryModel?  필요
    //directMessageModel?  필요

    private UUID id;
//    private UserSummaryModel with;
//    private DirectMessageModel lastestMessage;
//    private boolean hasUnread;

    public static ConversationModel create(UUID id) {

        return ConversationModel.builder().id(id).build();
    }


}
