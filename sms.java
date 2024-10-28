// Method to add student
private void addStudent() {
    String id = idField.getText();
    String name = nameField.getText();
    // other field data
    try {
        statement = connection.prepareStatement("INSERT INTO student (Id, Name, Phone, Email, Address, Gender, DOB) VALUES (?, ?, ?, ?, ?, ?, ?)");
        statement.setString(1, id);
        statement.setString(2, name);
        // set other fields
        statement.executeUpdate();
        JOptionPane.showMessageDialog(this, "Student Added");
        loadData();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

// Method to update student
private void updateStudent() {
    String id = idField.getText();
    // Update logic
    loadData();
}

// Method to delete student
private void deleteStudent() {
    String id = idField.getText();
    // Delete logic
    loadData();
}

// Method to search student
private void searchStudent() {
    String id = idField.getText();
    // Search logic
}
