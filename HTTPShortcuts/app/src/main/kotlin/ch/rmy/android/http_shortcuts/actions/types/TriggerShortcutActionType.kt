package ch.rmy.android.http_shortcuts.actions.types

import android.content.Context
import ch.rmy.android.http_shortcuts.actions.ActionDTO
import ch.rmy.android.http_shortcuts.scripting.ActionAlias

class TriggerShortcutActionType(context: Context) : BaseActionType(context) {

    override val type = TYPE

    override fun fromDTO(actionDTO: ActionDTO) = TriggerShortcutAction(this, actionDTO.data)

    override fun getAlias() = ActionAlias(
        functionName = "triggerShortcut",
        parameters = listOf(TriggerShortcutAction.KEY_SHORTCUT_NAME_OR_ID)
    )

    companion object {

        const val TYPE = "trigger_shortcut"

    }

}