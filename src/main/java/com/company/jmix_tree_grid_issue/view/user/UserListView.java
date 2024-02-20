package com.company.jmix_tree_grid_issue.view.user;

import com.company.jmix_tree_grid_issue.entity.User;
import com.company.jmix_tree_grid_issue.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "users", layout = MainView.class)
@ViewController("sb_User.list")
@ViewDescriptor("user-list-view.xml")
@LookupComponent("usersDataGrid")
@DialogMode(width = "64em")
public class UserListView extends StandardListView<User> {
}