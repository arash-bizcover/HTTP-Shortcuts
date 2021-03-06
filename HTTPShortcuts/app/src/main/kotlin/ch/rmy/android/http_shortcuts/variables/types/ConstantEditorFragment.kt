package ch.rmy.android.http_shortcuts.variables.types

import ch.rmy.android.http_shortcuts.R
import ch.rmy.android.http_shortcuts.data.models.Variable
import ch.rmy.android.http_shortcuts.variables.VariableButton
import ch.rmy.android.http_shortcuts.variables.VariableEditText
import ch.rmy.android.http_shortcuts.variables.VariableViewUtils.bindVariableViews
import kotterknife.bindView

class ConstantEditorFragment : VariableEditorFragment() {

    override val layoutResource = R.layout.variable_editor_constant

    private val variableButton: VariableButton by bindView(R.id.variable_button)
    private val inputVariableValue: VariableEditText by bindView(R.id.input_variable_value)

    override fun setupViews() {
        bindVariableViews(inputVariableValue, variableButton, variablePlaceholderProvider)
            .attachTo(destroyer)
    }

    override fun updateViews(variable: Variable) {
        inputVariableValue.rawString = variable.value ?: ""
    }

    override fun compileIntoVariable(variable: Variable) {
        variable.value = inputVariableValue.rawString
    }
}
