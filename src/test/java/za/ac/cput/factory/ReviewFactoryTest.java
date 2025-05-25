package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Review;

import static org.junit.jupiter.api.Assertions.*;

/*
 * ReviewFactoryTest.java
 * Unit test for ReviewFactory
 * Author: S.Malotana (221800662)
 * Date: 18 May 2025
 */
public class ReviewFactoryTest {
    

    @Test
    public void testCreateReviewSuccess() {
        Review review = ReviewFactory.createReview(101, "5 stars", "Excellent laptop!");
        assertNotNull(review);
        assertEquals(101, review.getReviewID());
        assertEquals("5 stars", review.getRating());
        assertEquals("Excellent laptop!", review.getComment());
    }

    @Test
    public void testCreateReviewFailWithEmptyRating() {
        Review review = ReviewFactory.createReview(102, "", "Good");
        assertNull(review);
    }


    @Test
    public void testCreateReviewFailWithNullComment() {
        Review review = ReviewFactory.createReview(103, "3 stars", null);
        assertNull(review);
    }
}
