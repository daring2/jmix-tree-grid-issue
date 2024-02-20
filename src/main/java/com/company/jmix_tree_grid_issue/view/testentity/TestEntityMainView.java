package com.company.jmix_tree_grid_issue.view.testentity;

import com.company.jmix_tree_grid_issue.entity.TestEntity;
import com.company.jmix_tree_grid_issue.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "TestEntityMainView", layout = MainView.class)
@ViewController("sb_TestEntity.main")
@ViewDescriptor("test-entity-main-view.xml")
public class TestEntityMainView extends StandardView {

    @Autowired
    DialogWindows dialogWindows;

    @Subscribe(id = "openListView", subject = "clickListener")
    public void onOpenListViewClick(final ClickEvent<JmixButton> event) {
        dialogWindows.lookup(this, TestEntity.class).open();
    }

}
