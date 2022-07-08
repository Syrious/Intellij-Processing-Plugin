// Generated from /home/dbrinkmann/Privat/Repo/Java/Processing-Intellij-Plugin/src/main/java/com/github/syrious/processingintellijplugin/antlr/Processing.g4 by ANTLR 4.10.1
package com.github.syrious.processingintellijplugin.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProcessingParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProcessingVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#processingSketch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcessingSketch(ProcessingParser.ProcessingSketchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#javaProcessingSketch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavaProcessingSketch(ProcessingParser.JavaProcessingSketchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#staticProcessingSketch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticProcessingSketch(ProcessingParser.StaticProcessingSketchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#activeProcessingSketch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActiveProcessingSketch(ProcessingParser.ActiveProcessingSketchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#warnMixedModes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWarnMixedModes(ProcessingParser.WarnMixedModesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(ProcessingParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#warnTypeAsVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWarnTypeAsVariableName(ProcessingParser.WarnTypeAsVariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(ProcessingParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#functionWithPrimitiveTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionWithPrimitiveTypeName(ProcessingParser.FunctionWithPrimitiveTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(ProcessingParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#colorPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorPrimitiveType(ProcessingParser.ColorPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(ProcessingParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ProcessingParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#hexColorLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexColorLiteral(ProcessingParser.HexColorLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(ProcessingParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(ProcessingParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(ProcessingParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(ProcessingParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(ProcessingParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(ProcessingParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(ProcessingParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(ProcessingParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(ProcessingParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(ProcessingParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(ProcessingParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(ProcessingParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(ProcessingParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(ProcessingParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(ProcessingParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(ProcessingParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(ProcessingParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(ProcessingParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(ProcessingParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(ProcessingParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(ProcessingParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(ProcessingParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(ProcessingParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(ProcessingParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(ProcessingParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(ProcessingParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(ProcessingParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(ProcessingParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(ProcessingParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(ProcessingParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(ProcessingParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(ProcessingParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(ProcessingParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(ProcessingParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(ProcessingParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(ProcessingParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(ProcessingParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(ProcessingParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(ProcessingParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(ProcessingParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(ProcessingParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(ProcessingParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(ProcessingParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(ProcessingParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(ProcessingParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#baseStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseStringLiteral(ProcessingParser.BaseStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#multilineStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultilineStringLiteral(ProcessingParser.MultilineStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(ProcessingParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(ProcessingParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(ProcessingParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(ProcessingParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(ProcessingParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(ProcessingParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(ProcessingParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(ProcessingParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(ProcessingParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(ProcessingParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(ProcessingParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(ProcessingParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(ProcessingParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(ProcessingParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(ProcessingParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(ProcessingParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ProcessingParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(ProcessingParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(ProcessingParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(ProcessingParser.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ProcessingParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(ProcessingParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(ProcessingParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(ProcessingParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(ProcessingParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(ProcessingParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(ProcessingParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(ProcessingParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(ProcessingParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(ProcessingParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(ProcessingParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(ProcessingParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(ProcessingParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(ProcessingParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ProcessingParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(ProcessingParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(ProcessingParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(ProcessingParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(ProcessingParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(ProcessingParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(ProcessingParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(ProcessingParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(ProcessingParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(ProcessingParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(ProcessingParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(ProcessingParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(ProcessingParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(ProcessingParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(ProcessingParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(ProcessingParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(ProcessingParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(ProcessingParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(ProcessingParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(ProcessingParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProcessingParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(ProcessingParser.ArgumentsContext ctx);
}