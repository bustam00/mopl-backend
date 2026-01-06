package com.mopl.api.interfaces.api.review;

import com.mopl.api.application.review.ReviewFacade;
import com.mopl.security.userdetails.MoplUserDetails;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/reviews")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewFacade reviewFacade;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ReviewResponse createReview(
<<<<<<< HEAD
        @RequestHeader(REQUESTER_ID_HEADER) UUID requesterId, // Security 완성 후 삭제될 임의 코드
=======
        @AuthenticationPrincipal MoplUserDetails userDetails,
>>>>>>> 08fed4c88d915b2b9a64565a9a8c6e8d9672a190
        @RequestBody @Valid ReviewCreateRequest request
    ) {
        // 인증된 객체에서 id만 가져옴
        UUID requesterId = userDetails.userId();

        // 파사드가 이미 Response를 반환하므로 바로 리턴하면 끝!
        return reviewFacade.createReview(
            requesterId,
            request
        );
    }

    @PatchMapping("/{reviewId}")
    @ResponseStatus(HttpStatus.OK)
    public ReviewResponse updateReview(
        @AuthenticationPrincipal MoplUserDetails userDetails,
        @PathVariable UUID reviewId,
        @RequestBody @Valid ReviewUpdateRequest request
    ) {

        // 인증된 객체에서 id만 가져옴
        UUID requesterId = userDetails.userId();

        return reviewFacade.updateReview(
            requesterId,
            reviewId,
            request
        );
    }

    @DeleteMapping("/{reviewId}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteReview(
        @AuthenticationPrincipal MoplUserDetails userDetails,
        @PathVariable UUID reviewId
    ) {
        // 인증된 객체에서 id만 가져옴
        UUID requesterId = userDetails.userId();

        reviewFacade.deleteReview(requesterId, reviewId);
    }
}
