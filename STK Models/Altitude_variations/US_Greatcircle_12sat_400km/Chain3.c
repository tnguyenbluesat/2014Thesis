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
    Object  Satellite/400km_p1_1/Receiver/adsb_satrcvr2
    Object  Satellite/400km_p1_1/Transmitter/Cubesat_ADSB_5W5
    Object  Facility/Heathrow/Receiver/ADSB_GndRcvr11
   SaveMode    1
BEGIN StrandAccesses

  Strand    Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6 To Satellite/400km_p1_1/Receiver/adsb_satrcvr2 To Satellite/400km_p1_1/Transmitter/Cubesat_ADSB_5W5 To Facility/Heathrow/Receiver/ADSB_GndRcvr11
    Start    1118.9492021416615
    Stop     1707.5716311378255
    Start    6885.5114158022507
    Stop     7325.2549541378257
    Start    12627.31487802927
    Stop     12857.535099230847
    Start    67353.348132925428
    Stop     67598.350907280023
    Start    72804.39421133112
    Stop     73427.338206670436
    Start    78540.079830634349
    Stop     79041.803293264195
    Start    84340.331091767745
    Stop     84570.656871249565
    Start    262346.87143989897
    Stop     262387.3030870076
    Start    268088.69942566677
    Stop     268336.60147996258
    Start    273875.157216097
    Stop     274220.32292498706
    Start    339800.03593130648
    Stop     340184.83021280949
    Start    345582.72328050662
    Stop     346108.41280425718
    Start    351328.51509068522
    Stop     351969.68305249535
    Start    357085.65485686844
    Stop     357490.78989851952
    Start    417231.30736445682
    Stop     417871.62442120607
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

