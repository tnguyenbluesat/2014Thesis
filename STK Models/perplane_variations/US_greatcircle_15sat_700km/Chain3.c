stk.v.10.0
WrittenBy    STK_v10.0.2

BEGIN Chain

Name  Chain3
BEGIN Definition

   Type        Chain
   Operator    Or
   Order       1
   Recompute   Yes
   IntervalType    0
   ComputeIntervalStart    0.000000
   ComputeIntervalStop     7300800.000000
    ComputeIntervalPtr
	BEGIN	EVENTINTERVAL
			BEGIN Interval
				Start	3 Dec 2013 01:00:00.000000000
				Stop	25 Feb 2014 13:00:00.000000000
			END Interval
			IntervalState	Explicit
	END	EVENTINTERVAL

   UseSaveIntervalFile    No
   UseMinAngle     No
   UseMaxAngle     No
   UseMinLinkTime     No
   LTDelayCriterion    2.000000
   TimeConvergence     0.005000
   AbsValueConvergence 1.000000e-014
   RelValueConvergence 1.000000e-008
   MaxTimeStep         360.000000
   MinTimeStep         1.000000e-002
   UseLightTimeDelay   Yes
    DetectEventsUsingSamplesOnly No
    Object  Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6
    Object  Satellite/700km_p1_1/Receiver/adsb_satrcvr2
    Object  Satellite/700km_p1_1/Transmitter/Cubesat_ADSB_5W5
    Object  Facility/Heathrow/Receiver/ADSB_GndRcvr11
   SaveMode    1
BEGIN StrandAccesses

  Strand    Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6 To Satellite/700km_p1_1/Receiver/adsb_satrcvr2 To Satellite/700km_p1_1/Transmitter/Cubesat_ADSB_5W5 To Facility/Heathrow/Receiver/ADSB_GndRcvr11
    Start    1088.7545587403806
    Stop     1936.0221467978492
    Start    7262.0726254951915
    Stop     7911.3638638563125
    Start    13404.870732024974
    Stop     13811.494040978101
    Start    19585.413708643482
    Stop     19729.455011679842
    Start    65971.224724586253
    Stop     66201.378786686371
    Start    71638.382751078127
    Stop     72489.093922626023
    Start    77750.726478153781
    Stop     78528.570298447055
    Start    83947.733548837365
    Stop     84437.048255351227
    Start    90138.026062748002
    Stop     90321.195743662858
    Start    191523.28986029894
    Stop     191667.82339604141
    Start    262050.46088761732
    Stop     262301.71046256169
    Start    268196.02322704718
    Stop     268674.01286527346
    Start    274358.52642287128
    Stop     274978.82545380166
    Start    338725.64634550991
    Stop     339340.95480235643
    Start    344922.84212015179
    Stop     345680.29496146843
    Start    351079.84441705601
    Stop     351964.33433058212
    Start    357225.03055621742
    Stop     357862.9027443587
    Start    363486.28568992647
    Stop     363743.64917869621
    Start    415426.6230198259
    Stop     416299.59305123222
END StrandAccesses

   UseLoadIntervalFile    No

END Definition

BEGIN Extensions
    
    BEGIN Graphics

BEGIN Attributes

StaticColor					#ff00ff
AnimationColor					#ffff00
AnimationLineWidth					2.000000
StaticLineWidth					3.000000

END Attributes

BEGIN Graphics
    ShowGfx                Off
    ShowStatic             Off
    ShowAnimationHighlight On
    ShowAnimationLine      On
    ShowLinkDirection      Off
END Graphics
    END Graphics
    
    BEGIN ADFFileData
    END ADFFileData
    
    BEGIN Desc
    END Desc
    
    BEGIN Crdn
    END Crdn
    
    BEGIN VO
    END VO

END Extensions

END Chain

