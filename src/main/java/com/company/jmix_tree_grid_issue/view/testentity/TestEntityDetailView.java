package com.company.jmix_tree_grid_issue.view.testentity;

import com.company.jmix_tree_grid_issue.entity.TestEntity;
import com.company.jmix_tree_grid_issue.view.main.MainView;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "testEntity/detail", layout = MainView.class)
@ViewController("sb_TestEntity.detail")
@ViewDescriptor("test-entity-detail-view.xml")
@EditedEntityContainer("testEntityDc")
public class TestEntityDetailView extends StandardDetailView<TestEntity> {

    @Override
    protected void findEntityId(BeforeEnterEvent event) {
        // Because DTO entity cannot be loaded by Id, we need to prevent Id parsing from route parameters
    }

}
