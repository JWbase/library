package com.group.libraryapp.domain.user.loanhistory;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserLoanHistoryRepository extends JpaRepository<UserLoanHistory, Long> {

    // SELECT * FROM user_loan_history where book_name = ? and is return = ?
    boolean existsByBookNameAndIsReturn(String name, boolean isReturn);

    //대출기록
    Optional<UserLoanHistory> findByUserIdAndBookName(long userId, String bookName);
}
