import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)

public class SearchSetTest {

    @Test
    public void searchSet_insertsElements_whenTreeEmpty() {
        // ARRANGE
        SearchSet search = new SearchSet();

        // ACT
        search.insert(5);
        boolean doesContain = search.contains(5);

        // ASSERT
        assertThat(doesContain).isEqualTo(true);
    }

    @Test
    public void searchSet_insertsElements_whenTreeNotEmpty() {
        // ARRANGE
        SearchSet search = new SearchSet();

        // ACT
        search.insert(5);
        search.insert(6);
        boolean doesContain = search.contains(6);

        // ASSERT
        assertThat(doesContain).isEqualTo(true);
    }

    @Test
    public void searchSet_hasOneElement_whenTreeHasOneElement() {
        // ARRANGE
        SearchSet search = new SearchSet();

        // ACT
        search.insert(5);
        int numElements = search.getNumberElements();

        // ASSERT
        assertThat(numElements).isEqualTo(1);
    }

    @Test
    public void searchSet_hasNoElements_whenTreeHasNoElement() {
        // ARRANGE
        SearchSet search = new SearchSet();

        // ACT
        int numElements = search.getNumberElements();

        // ASSERT
        assertThat(numElements).isEqualTo(0);
    }

    @Test
    public void searchSet_containsElement_whenTreeContainsElement() {
        // ARRANGE
        SearchSet search = new SearchSet();

        // ACT
        search.insert(5);
        boolean doesContain = search.contains(5);

        // ASSERT
        assertThat(doesContain).isEqualTo(true);
    }

    @Test
    public void searchSet_doesntContainsElement_whenTreeDoesntContainsElement() {
        // ARRANGE
        SearchSet search = new SearchSet();

        // ACT
        search.insert(5);
        boolean doesContain = search.contains(6);

        // ASSERT
        assertThat(doesContain).isEqualTo(false);
    }
}

