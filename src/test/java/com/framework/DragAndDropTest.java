package com.framework;

import com.pages.DragAndDropPage;
import org.junit.jupiter.api.Test;

public class DragAndDropTest extends BaseTest {

    @Test
    public void testDragAndDrop(){
        driver.get("https://testpages.herokuapp.com/styled/drag-drop-javascript.html");
        DragAndDropPage drop = new DragAndDropPage(driver);
        drop.dragTo();
//        drop.dragToXAndY(125, 250);
    }
}
