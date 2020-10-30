package com.framework;

import com.pages.GithubProjectPage;
import com.pages.OverviewPage;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class OverviewTabTests extends BaseTest {
    String user = "mgmacdougall";
    String baseURL = "https://github.com/";

    @BeforeEach
    void reset(){
        driver.get("https://github.com/mgmacdougall");
    }

    @Test
    void isUserNameCorrect(){
        OverviewPage op = new OverviewPage(driver);
        assertEquals(op.userName(user), user);
    }

    @Test
    void canOpenLink(){
        GithubProjectPage gitHub = new GithubProjectPage(driver);
        gitHub.openGitHubProject(user,baseURL);
        String result =driver.getCurrentUrl();
        String expected = "https://github.com/mgmacdougall/a_random_quote_generator-v1";
        assertEquals(result, expected );
    }

    @Test
    void isReposCorrect(){
        GithubProjectPage gitHub = new GithubProjectPage(driver);
        int items = gitHub.countOfProjects("https://github.com/mgmacdougall/");
        assertEquals(6, items);
    }

}

